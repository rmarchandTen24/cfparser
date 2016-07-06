
public class CFCodeCoverageChecker extends CFSCRIPTParserBaseListener {
	
	public static void main(String[] args) {
		System.out.println("This is the main section ");
		
		
		//STEP 1: be able to pass Slatwall directory as an argument from command line
		
		String slatwallDirectoryPath = args[0];
		System.out.println( slatwallDirectoryPath  );
		
		//STEP 2: read all file names in /model folder store info in an array of file objects 
		//		  [
		//			{
		//				filename:"Product.cfc",
		//				path:"/entity"
		//				functions:["getAvailableForPurchaseFlag","..."]
		//			}
		//		  ] 
		
		//STEP 3: check for equivalent test files in /meta/tests/unit{{file.path}}/{{file.filename}}
		//Store in an array of testfiles with keys filename and path as well.
		
		//STEP 4: parse test files and verify function is being tested
		
	}
}