use college;

-- 테이블 생성 코드

-- department(학과)테이블생성
create table department(
	department_id integer primary key, 		 	-- department_id는 primary key
    department_name varchar(50) not null,		-- department_name은 반드시 입력해야 하므로 NOT NULL 사용
    department_location varchar(50) not null	-- department_location은 반드시 입력해야 하므로 NOT NULL 사용
);


-- studnet(학생)테이블생성
create table student(
	student_id integer primary key,         -- id는 primary key
    student_name varchar(50) not null,		-- 이름은 반드시 입력해야 하므로 NOT NULL 사용
    phone_number varchar(50) not null,      -- phone_number는 반드시 입력해야 하므로 NOT NULL 사용
    department_id int not null				-- department_id 반드시 입력해야 하므로 NOT NULL 사용
);
