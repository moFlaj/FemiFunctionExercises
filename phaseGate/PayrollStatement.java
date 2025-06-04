import java.math.BigDecimal;
import java.util.Arrays;
import java.util.ArrayList;
public class EmployeePayroll{

	public static String setEmployeeName(String[] employeesInfo, String name){
		String ifSuccessOrFail = "";
		try{
			if(name != null && !name.isBlank()){
				employeesInfo[0] = name;
				ifSuccessOrFail = "Succesful. Kindly proceed";
			}
			else{
				throw new NullPointerException("Name cannot be empty. Set name to proceed.");
			}

		} catch(NullPointerException e){
			System.out.println(e.getMessage());
	
			}

		catch(IllegalArgumentException f){
			System.out.println(f.getMessage());
	
			}

	}

	public static String getEmployeeName(String[] employeesInfo){
		return employeesInfo[0];

	}

	public static String noOfHoursPerWeek(String[] employeesInfo, String hours){
		String ifSuccessOrFail = "";
		try{
			if(hours != null && !hours.isBlank()){
				Integer convertToInt = Integer.parseInt(hours);

				if(convertToInt <= 168 && convertToInt > 0){
					employeesInfo[1] = convertToInt;	
					ifSuccessOrFail = "Succesful. Kindly proceed";
				}
				else{
					throw new IllegalArgumentException("Invalid input. Enter a value greater than 0 and less than 169.");
				}
			}
			else {
				throw new IllegalArgumentException("This cannot be empty!");
				
			}

		}
		catch(NumberFormatException stringToIntError){
			ifSuccessOrFail = stringToIntError.getMessage();
		}
		catch(IllegalArgumentException invalidInput){
			ifSuccessOrFail = invalidInput.getMessage();
		}

		return ifSuccessOrFail;
	}

	public static String getEmployeeHours(String[] employeesInfo){
		return employeesInfo[1];

	}

	public static String hourlyPayRate(String[] employeesInfo, String payRate){
		String ifSuccessOrFail = "";
		try{
			if(payRate != null && !payRate.isBlank()){
				BigDecimal convertToDouble = new BigDecimal(payRate);
				int compare = converToDec.compareTo(new BigDecimal("0.0"));
				if(compare > 0){
					ifSuccessOrFail = "Succesful. Kindly proceed";
					employeesInfo[2] = convertToDouble.toString();
				}
				else{
					throw new IllegalArgumentException("Invalid input. Negative value was entered.");
				}
			}
			else{
				throw new IllegalArgumentException("This is a required field. Cannot be empty");
			}
		}
		catch(NumberFormatException stringToDoubleError){
			ifSuccessOrFail = stringToDoubleError.getMessage();
		}
		catch(IllegalArgumentException invalidInput){
			ifSuccessOrFail = invalidInput.getMessage();
		}
		return ifSuccessOrFail;
	}

	public static String getEmployeePayRate(String[] employeesInfo){
		return employeesInfo[2];

	}

	public static String fedWithHoldingRate(String[] employeesInfo, String fedRate){
		String ifSuccessOrFail = "";
		try{
			if(fedRate != null && !fedRate.isBlank()){
				BigDecimal converToDec = new BigDecimal(fedRate);
				int compare = converToDec.compareTo(new BigDecimal("0.0"));
				if(compare > 0){
					ifSuccessOrFail = "Succesful. Kindly proceed";
					employeesInfo[3] = converToDec.toString();

				}
				else{
					throw new IllegalArgumentException("Invalid input. Negative value was entered.");
				}
			}
			else{
				throw new IllegalArgumentException("This is a required field. Cannot be empty");

			}
		}
		catch(NumberFormatException stringToDoubleError){
			ifSuccessOrFail = stringToDoubleError.getMessage();
		}
		catch(IllegalArgumentException invalidInput){
			ifSuccessOrFail = invalidInput.getMessage();
		}
		return ifSuccessOrFail;
	}

	public static String getEmployeeFedRate(String[] employeesInfo){
		return employeesInfo[3];

	}

	public static String stateWithHoldingRate(String[] employeesInfo, String stateRate){

		String ifSuccessOrFail = "";
		try{
			if(stateRate != null && !stateRate.isBlank()){
				BigDecimal converToDec = new BigDecimal(stateRate);
				int compare = converToDec.compareTo(new BigDecimal("0.0"));
				if(compare > 0){
					ifSuccessOrFail = "Succesful. Kindly proceed";
					employeesInfo[4] = converToDec.toString();

				}
				else{
					throw new IllegalArgumentException("Invalid input. Negative value was entered.");
				}
			}
			else{
				throw new IllegalArgumentException("This is a required field. Cannot be empty");

			}
		}
		catch(NumberFormatException stringToDoubleError){
			ifSuccessOrFail = stringToDoubleError.getMessage();
		}
		catch(IllegalArgumentException invalidInput){
			ifSuccessOrFail = invalidInput.getMessage();
		}
		return ifSuccessOrFail;
	}

	public static String getEmployeeStateRate(String[] employeesInfo){
		return employeesInfo[4];

	}

	public static String grossPay(String[] employeesInfo){
		String ifSuccessOrFail = "";
		try{
			if(employeesInfo[1] != null && !employeesInfo[1] .isBlank() && employeesInfo[2]  != null && !employeesInfo[2] .isBlank()){
				BigDecimal rate = new BigDecimal(employeesInfo[1]);
				int compare = employeesInfo[1].compareTo(new BigDecimal("0.0"));
				BigDecimal noOfHours = new BigDecimal(employeesInfo[2]);
				compare = compare + employeesInfo[2].compareTo(new BigDecimal("0.0"));
				if(compare > 1){
					BigDecimal grossPayValue = employeesInfo[1].multiply(employeesInfo[2]);
					ifSuccessOrFail = grossPayValue.toString();
					
				}
				else{
					throw new IllegalArgumentException("Invalid input. Negative value was entered.");

				}
			}
			else{
				throw new IllegalArgumentException("Required information not complete.");
			}

		}
		catch(NumberFormatException stringToDecimalError){
			ifSuccessOrFail = stringToDecimalError.getMessage();
		}
		catch(IllegalArgumentException invalidInput){
			ifSuccessOrFail = invalidInput.getMessage();
		}

		return ifSuccessOrFail;
	}


	public static String fedDeductions(String[] employeesInfo){
		String ifSuccessOrFail = "";
		try{
			if(employeesInfo[3] != null && !employeesInfo[3] .isBlank() && employeesInfo[5]  != null && !employeesInfo[5] .isBlank()){
				BigDecimal fedRate = new BigDecimal(employeesInfo[3]);
				int compare = employeesInfo[3].compareTo(new BigDecimal("0.0"));
				BigDecimal grossPay = new BigDecimal(employeesInfo[5]);
				compare = compare + employeesInfo[5].compareTo(new BigDecimal("0.0"));
				if(compare > 1){
					BigDecimal fedWithHolding = employeesInfo[3].divide(new BigDecimal("100")).multiply(employeesInfo[5]);
					ifSuccessOrFail = fedWithHolding.toString();
				}
				else{
					throw new IllegalArgumentException("Invalid input. Negative value was entered.");

				}
			}
			else{
				throw new IllegalArgumentException("Required information not complete.");
			}

		}
		catch(NumberFormatException stringToDecimalError){
			ifSuccessOrFail = stringToDecimalError.getMessage();
		}
		catch(IllegalArgumentException invalidInput){
			ifSuccessOrFail = invalidInput.getMessage();
		}

		return ifSuccessOrFail;
	}


	public static String stateDeductions(String[] employeesInfo){
		String ifSuccessOrFail = "";
		try{
			if(employeesInfo[4] != null && !employeesInfo[4] .isBlank() && employeesInfo[5]  != null && !employeesInfo[5] .isBlank()){
				BigDecimal stateRate = new BigDecimal(employeesInfo[4]);
				int compare = employeesInfo[4].compareTo(new BigDecimal("0.0"));
				BigDecimal grossPay = new BigDecimal(employeesInfo[5]);
				compare = compare + employeesInfo[5].compareTo(new BigDecimal("0.0"));
				if(compare > 1){
					BigDecimal stateWithHolding = employeesInfo[4].divide(new BigDecimal("100")).multiply(employeesInfo[5]);
					ifSuccessOrFail = stateWithHolding.toString();
				}
				else{
					throw new IllegalArgumentException("Invalid input. Negative value was entered.");

				}
			}
			else{
				throw new IllegalArgumentException("Required information not complete.");
			}

		}
		catch(NumberFormatException stringToDecimalError){
			ifSuccessOrFail = stringToDecimalError.getMessage();
		}
		catch(IllegalArgumentException invalidInput){
			ifSuccessOrFail = invalidInput.getMessage();
		}

		return ifSuccessOrFail;
	}


	public static void addEmployeesInfo(ArrayList<String[]> employees, String[] employeesInfo){
		
		String ifSuccessOrFail = "";
		int counter = 0;
		try{
			for(int index = 0; index <  employeesInfo.length; index++){
				if(!employeeInfo[index].isBlank())counter++;

			}
			if(counter == 5){
				employees.add(employeesInfo);
				ifSuccessOrFail = "Employee payroll added =========>";
			}
			else{
				throw new IllegalArgumentException("Required information not complete.");
			}
		}
		catch(IllegalArgumentException requiredField){
			ifSuccessOrFail = requiredField.getMessage();
		}
		
		return ifSuccessOrFail;
	
	}

	public static void listAllEmployees(ArrayList<String[]> employees){
		
		for(String[] employee : employees){
			System.out.println(Arrays.toString(employee));
		}

	
	}

	public static String deductionMessage(ArrayList<String[]> employees, String name){
		String deductions = "";
		int count = 0;
		try{
			if(employees.size() > 0){
				for(String[] employee : employees){
					for(String info : employee){
						if(name.equals(info)){
							deductions = "Deductions:" + "\n";
							deductions = deductions + "	Federal witholding" + "(" + employeesInfo[3] + "): $" + fedDeductions(employee) + "\n";
							deductions = deductions + "	State witholding" + "(" + employeesInfo[4] + "): $" + stateDeductions(employee) + "\n";
							BigDecimal fed = new BigDecimal(fedDeductions(employee));
							BigDecimal state = new BigDecimal(stateDeductions(employee));
							BigDecimal total = fed.add(state);
							deductions = deductions + "	Total witholding: $" + total + "\n";
							BigDecimal netPay = (new BigDecimal(employee)).subtract(total);
							deductions = deductions + "Net pay: $" + netPay;
							count+=1;
							break;
						}
						else{throw new IllegalArgumentException("No employees of this name found.");}
					
					}
					if(count == 1)break;
				}
			}	
			else{throw new IllegalArgumentException("No employees registered.");}
		}
		catch(IllegalArgumentException e){deductions = e.getMessage();}

		return deductions;


	}





	}