package com.enrol
    
class BootStrap {

    def init = {servletContext->

  def computing=new Course(
  title:'Bsc Hon Computing',
  code:'COMP234',
  leader:'Dr Mary Poppins',
  department:'Computing',
  startDate:new Date('11/11/2016'),
  endDate:new Date('11/11/2020'),
  numberOfStudents:45,
  description:'Add some text here',

  tuitionFees:9000,
  studyMode:'Full-time'
).save()

def JohnSmith=new Lecturer(

fullName:'John Smith',	
post:'Head lecturer',
subject:'Computing',
lecturerEmail:'jsmith@gmail.com',
office:'Dpt.Computing',
bio:'Computing Lecturer',
).save()





    }
    def destroy = {
    }
}
