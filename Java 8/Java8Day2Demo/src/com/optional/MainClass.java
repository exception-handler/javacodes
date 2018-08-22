package com.optional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class MainClass {
/*public static Account find(List<Account> accounts,String name) {
		for(Account account : accounts) {
		      if(account.getName().equals(name)) {
		         return account;
		      }
		   }
		   return null;
		}
*/
	
public static Optional<Account> find(List<Account>
accounts,String name) {
		   for(Account account : accounts) {
		      if(account.getName().equals(name)) {
		         return Optional.of(account);
		      }
		   }
		   return Optional.empty();
		}



public static void main(String[] args) {
	List<Account> accounts = Arrays.asList(new Account("Apple"),
                new Account("NetAPP"),
                new Account("Fdex"),
                new Account("Mitchel"),
                new Account("Mitchel"));

	
	//Account found = find(accounts,"pple");//ok
	//Account found = find(accounts,"apple");//Exception
    //String name = found.getName(); //uh oh!
//	System.out.println(name);		

/*Optional<Account> found = find(accounts,"Apple");
if(found.isPresent()) {

Account ac = found.get();
String name = ac.getName();
System.out.println(name);
}
else
{
System.out.println("Empty");
}
*/
	
/* Remove Boiler Plate code*/
//
/*Optional<Account> found = find(accounts,"Apple");
found.ifPresent(s->System.out.println(s.getName()));
*/	

Optional<Account> found = find(accounts,"Ale");
 String name = found.orElse(new Account("Not found")
		 ).getName();
	
System.out.println(name);

}
	}


