st.executeUpdate("update student_lesson set lid = '"+lidnum+"' 
where sid = (select sid from student where no = '"+no+"')
and lid = whatever_the_lid_of_Java_is");
