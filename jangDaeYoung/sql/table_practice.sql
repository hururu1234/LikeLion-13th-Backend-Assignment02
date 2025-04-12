use college;

-- student테이블 학생조회
select * from student;

-- department 테이블 조회
select * from department;

-- student id 수정  1번 student_id -> 100번으로 수정
update student
set student_id = 100
where student_id = 1;

-- student삭제
delete from student
where student_id = 1;


-- student테이블, department테이블 inner join
select
	student.student_name as 학생명,
	department.department_name as 학과명
from
	department
join
	student
on department.department_id = student.department_id;

