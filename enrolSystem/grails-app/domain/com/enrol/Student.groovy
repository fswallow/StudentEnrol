package com.enrol

class Student {

String name
String studentID                               //declared variables
Date dob
Boolean isFundingAvailable
String stuemail
String username
String password
String course

String toString(){

"$name,$studentID,$course"
}








    static constraints = {

name blank:false, nullable:false
studentID blank:false, nullable:false
dob blank:false, nullable:false
stuemail blank:false, nullable:false, email:true
username blank:false, nullable:false, unique:true
password blank:false, nullable:false
isFundingAvailable blank:false, nullable:false
course blank:false, nullable:false






    }
}
