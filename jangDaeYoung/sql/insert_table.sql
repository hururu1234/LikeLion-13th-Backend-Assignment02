use college;

-- 테이블 데이터 입력코드


-- department(학과) 테이블 데이터 입력
insert into department(department_id, department_name,department_location) values
(1, "컴퓨터공학과", "a동"),
(2, "사회학과", "b동"),
(3, "경제학과", "c동");


-- student(학생)테이블 데이터 입력
insert into student(student_id, student_name, phone_number, department_id) values
(1, "민수" , "010-1111-1111", 1),
(2, "철수" , "010-2222-2222", 2),
(3, "영희" , "010-3333-3333", 3);