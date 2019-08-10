package structural_patterns.composite;

import java.util.HashMap;
import java.util.Map;

public class CompositeDemo {
    public static void main(String[] args) {

        Menu mainMenu = new Menu("Main", "/main");
        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        mainMenu.add(safetyMenuItem);

        MenuItem claimsSubMenu = new MenuItem("Claims", "/claims");
        mainMenu.add(claimsSubMenu);

        MenuItem personalClaim = new MenuItem("Personal Claim","/personalClaims");
//        personalClaim.add(new MenuItem("Personal Claim Sub Item", "/personalClaims/sub")); will throw an error
        mainMenu.add(personalClaim);


        System.out.println(mainMenu.toString());
        // remove item
        mainMenu.remove(safetyMenuItem);


    }

    public static void everyDayDemo() {
        Map<String, String> personalAttributes = new HashMap<>();
        personalAttributes.put("site_role", "person");
        personalAttributes.put("access_role", "limited");

        Map<String, String> groupAttributes = new HashMap<>();
        groupAttributes.put("group_role", "claims");

        Map<String, String> secAttributes = new HashMap<>();
        secAttributes.putAll(personalAttributes);
        secAttributes.putAll(groupAttributes);
        System.out.println(secAttributes);
    }
}
