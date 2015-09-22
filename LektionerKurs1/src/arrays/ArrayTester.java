package arrays;

class ArrayTester {

	public static void main(String[] args) {
		int[] month_days;
		month_days = new int[12];
		
		String[] months = {"january", "february", "march", "april", "may", "june", 
							"july", "august", "september", "october", "November", "December"};
		
		month_days[0] = 31;
		month_days[1] = 28;
		month_days[2] = 30;
		month_days[3] = 31;
		month_days[4] = 31;
		month_days[5] = 31;
		month_days[6] = 30;
		month_days[7] = 31;
		month_days[8] = 31;
		month_days[9] = 31;
		month_days[10] = 31;
		month_days[11] = 31;

		System.out.println(month_days[3]);
		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i] + " " + month_days[i]);
			
		}
		

	}

}
