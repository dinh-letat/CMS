-- convenient management store --
create database cms;
use cms;  

create table Product(
	product_id int primary key auto_increment not null,
    product_name varchar(255) not null,
    product_category varchar(50) not null,
    product_group varchar(50) not null,
    product_price decimal(10, 2) not null,
    product_quantity int not null,
    product_description text
);

create table Supplier(
	supplier_id int primary key auto_increment not null,
    supplier_name varchar(255) not null,
    address varchar(255),
    phone int,
    email varchar(50)
);

create table CartBill(
	bill_id int primary key auto_increment not null,
    sell_date date not null,
    client_id int,
    employee_id int,
    total decimal(10, 2),
    pay_types varchar(50) not null,
    foreign key(client_id) references Client(client_id),
    foreign key(employee_id) references Employee(employee_id)
);

create table BillDetail(
	bill_id int,
    product_id int,
    quantity int not null,
    price decimal(10, 2) not null,
    primary key(bill_id, product_id),
    foreign key(bill_id) references CartBill(bill_id),
    foreign key(product_id) references Product(product_id)
);

create table Client(
	client_id int primary key auto_increment not null,
    client_name varchar(255) not null,
    client_phone int not null,
    email varchar(255) not null,
    address varchar(255) not null,
    point int not null
);

create table Employee(
	employee_id int primary key auto_increment not null,
    employee_name varchar(255) not null,
    employee_position varchar(255) not null,
    username varchar(50) not null,
    password varchar(50) not null,
    employee_wage decimal(10, 2)
);

create table Wage(
	wage_id int auto_increment primary key not null,
    month date not null,
    wage_basic decimal(10, 2) not null,
    allowance decimal(10, 2) not null,
    reward decimal(10, 2) not null,
    total_wage decimal(10, 2),
    foreign key(wage_id) references Employee(employee_id)
);

