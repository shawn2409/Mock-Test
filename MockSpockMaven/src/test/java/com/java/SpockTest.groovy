package com.java

import java.sql.Connection
import java.sql.PreparedStatement

import com.mkyong.common.Add
import com.mkyong.customer.dao.CustomerDAO
import com.mkyong.customer.model.Customer

import spock.lang.Specification

class SpockTest extends Specification{

	

	def setup() {
		CustomerDAO cs=stub();
		PreparedStatement ps = Mock();
	}
	
	
	def "mock"() {
	given:
	def  nn=new Customer(9, "shawn", 25)
	
	//Connection conn= Mock();
	
	
	when:
	cs.insert(nn);
	//cs.insert((int)9, (String)"mkyong", (int)28);
	//cs.insert(9, "mkyong", 28);
	
	then:
	ps.executeUpdate();
	//1 * ps.close();
}
	
	
	
	/*def "two plus two should equal four"() {
		given:
		int left = 2
		int right = 2

		when:
		int result = left + right

		then:
		result == 4
	}

	def "adder-test"() {
		given: "a new Adder class is created"
		def adder = new Add();

		expect: "Adding two numbers to return the sum"
		adder.add(3, 4) == 7
	}
	def "should return Role.USER when asked for role"() {
		given:
		   List list = Stub()
		   list.size() >> 3
		expect:
		   // let's see if this works
		   list.size() == 3
	 }*/
	
}