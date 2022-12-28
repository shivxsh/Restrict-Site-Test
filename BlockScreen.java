//Maintain an arrayList for the websites to be blocked.
//For each website in the array :
    //Change the screen to a different link.
                    //or    
    //Make that link inaccessable unitl its inside the array
//Revoke the restrictions if user decides to remove the link from the array.


import java.util.*;

public class BlockScreen{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        ArrayList<String> links = new ArrayList<>();

        //Adding the links to the Array list
        System.out.println("Insert link to block : ");
        String link = scan.next();

        links.add(link);

        //Time to block the links
        System.out.println("Enter the URL that you want to visit :");
        String visitLink = scan.next();

        if(links.contains(visitLink)){
            System.out.println("User access restricted");
        }
        else{
            System.out.println("Access Granted. Happy Web Surfing!");
        }

        //Check
        //System.out.println(links);

        scan.close();
    }
}