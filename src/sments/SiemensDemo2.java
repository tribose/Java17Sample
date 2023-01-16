package sments;


/*
////check if word can be replaced with another word with single time edition
////////        Input:  ABC —> ABD////        Output: True
0, 1
ABC -> ABCD

src.length() + 1 == target.length()

for (int i = 0; i < targetArray.length - 2; i++) {

srcArry[i] == targetArray[i] {
    rteurn true
}


}

return


////Explanation: The total number of edits required is 1 (change D from C)////////
Input:  ABC —> AAA////        Output: False////
Explanation: The total number of edits required are 2 (replace B and C in the first string by A)////////        Input:  ABC —> ABC////        Output: False////        Explanation: The total number of edits required is 0 (both strings are the same)
 */
public class SiemensDemo2 {
}


/*

 employee table, department table
 print max salary by department

 empname, salary, deptId

 deptId, deptname




 SELECT dept.name, MAX(emp.salary) as max_salary
 FROM employee emp
 INNER JOIN department dept
 ON dept.deptId = emp.deptId
 GROUP BY dept.name;

 */


