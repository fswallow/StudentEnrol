package com.enrol

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
         when:"A Student has name, ID and course"
         
         def janet=new Student(name:'Janet taylor'
         studentID:'WSD101',
         course:'BSc Hon Engineering')

then:" the to streing method will merge them."

janet.tostring()== 'Janet taylor,45907812,BSc Hon Engineering'
    }
}
