package com.gl.departmentservice;

public class HRDepartment extends SuperDepartment {

	public HRDepartment()
	{
		
	}
	@Override
	public String departmentName()
	{
		return "Hr Department";
	}
	@Override
	public String getTodaysWork()
	{
		return "Fill today’s worksheet and mark your attendance";
	}
	@Override
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
	public String doActivity()
	{
		return "team Lunch";
	}
	public String isTodayAHoliday()
	{
		return "Today is not a holiday";
	}
}
