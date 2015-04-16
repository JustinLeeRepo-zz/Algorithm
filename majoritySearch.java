public static string MajoritySearch(InputStream sin){
	String candidate = "";
	string buf;
	int count = 0;
	Scanner s = new Scanner(sin);

	while(s.hasNextLine()){
		buf = s.nextLine();

		if(count == 0){
			candidate = buf;
			count = 1;
		}
		else if(candidate.equals(buf)){
			count++;
		}
		else{
			count--;
		}
	}
	return candidate;
}