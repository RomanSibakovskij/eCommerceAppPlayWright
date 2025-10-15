# eCommerceAppPlayWright

Simple Playwright test suite on basic user account creation, product addition to cart/checkout. All operations of this web application require a valid pre-created user account. The addition to wishlist / compare list, view orders feature seem to be non-operational (the testing of the latter is omitted until the feature is implemented).

#Tech Requirements:

 1.Java JDK 8 or higher 
 
 2.Apache Maven 
 
 3.IntelliJ IDEA (or another IDE that supports Java and Maven)

 4. JUnit5 5.1x
    
 5. Playwright 1.55

#Setup

1. Clone this repository into IntelliJ(or other IDE) workspace folder (or wherever the project can be launched by IDE)
2. Open the IDE and open the project folder
3. Navigate to the pom.xml file and install all required dependencies for the test run
4. Run the test suite on the IDE (or mvn test in-terminal)

## Test Case List

Important note: the guest user cannot perform operations, all of them require a valid user account


//user navigation to sign up page test

1.	// Test 001 -> navigate to sign up page test

//valid user account creation test

1.	// Test 002 -> valid user account creation test

//invalid user account creation tests

//no singular input

1.	// Test 002a -> invalid user account creation test - no user first name (the user account was created, test has failed)
2.	// Test 002b -> invalid user account creation test - no user last name (the user account was created, test has failed)
3.	// Test 002c -> invalid user account creation test - no user email (the user account was created, test has failed)
4.	// Test 002d -> invalid user account creation test - no user password/confirm password

//too short singular input

1.	// Test 002e -> invalid user account creation test - too short user first name (1 char) (the user account was created, test has failed)
2.	// Test 002f -> invalid user account creation test - too short user last name (1 char) (the user account was created, test has failed)
3.	// Test 002g -> invalid user account creation test - too short user email (1 char -> name, domain) (the user account was created, test has failed)
4.	// Test 002h -> invalid user account creation test - too short user password/confirm password (5 chars)

//too long singular input

1.	// Test 002i -> invalid user account creation test - too long user first name (100 chars) (the user account was created, test has failed)
2.	// Test 002j -> invalid user account creation test - too long user last name (100 chars) (the user account was created, test has failed)
3.	// Test 002k -> invalid user account creation test - too long user email (100 chars -> name, domain) (the user account was created, test has failed)
4.	// Test 002l -> invalid user account creation test - too long user password/confirm password (75 chars) (the user account was created, test has failed)

//invalid singular input format

1.	// Test 002m -> invalid user account creation test - invalid user first name format (special symbols only) (the user account was created, test has failed)
2.	// Test 002n -> invalid user account creation test - invalid user last name format (special symbols only) (the user account was created, test has failed)
3.	// Test 002o -> invalid user account creation test - invalid user email format missing '@') (the user account was created, test has failed)
4.	// Test 002p -> invalid user account creation test - existing user email (used beforehand in manual testing) (the user account was created, test has failed)
5.	// Test 002q -> invalid user account creation test - mismatching confirm password

//valid user logout test

1.	// Test 003 -> valid user logout test

//valid user login test

1.	// Test 004 -> valid user login test

//invalid user login test

//no singular input

1.	// Test 004a -> invalid user login test - no login email
2.	// Test 004b -> invalid user login test - no login password

//invalid singular input

1.	// Test 004c -> invalid user login test - invalid login email
2.	// Test 004d -> invalid user login test - invalid login email format (missing '@')
3.	// Test 004e -> invalid user login test - invalid login password

//user account view test

1.	// Test 005 -> view user account test (the user fails to get onto user account page, test has failed)

//add set home page product(s) to cart tests

1.	// Test 006 -> add single set home page product ("Chanel Coco Noir Eau De") to cart test (as guest) (the user account is required, test has failed, guest branch testing is halted here)
2.	// Test 006a -> add single set home page product ("Chanel Coco Noir Eau De") to cart test (as registered user)
3.	// Test 006b -> add multiple set home page products ("Powder Canister", "Calvin Klein CK One") to cart test (as registered user)

//update set product quantity in shopping cart modal test

1.	// Test 007 -> update set product quantity in shopping cart modal test

//product removal from shopping cart modal test

1.	// Test 008 -> product removal from shopping cart modal test

//add single home page product to wishlist tests

1.	// Test 009 -> add single set home page product ("Essence Mascara Lash Princess") to wishlist test (as guest) (the user account is required, test has failed, guest branch testing is halted here)
2.	// Test 009a -> add single set home page product ("Eyeshadow Palette with Mirror") to wishlist test (as registered user) (the user doesn't get onto wishlist page, test has failed)

//home page products "Quick View" feature tests

1.	// Test 010 -> home page products ("Essence Mascara Lash Princess", "Eyeshadow Palette with Mirror", "Powder Canister", "Red Lipstick", "Red Nail Polish", "Calvin Klein CK One") "Quick View" feature test (as guest)
2.	// Test 010a -> home page products ("Chanel Coco Noir Eau De", "Dior J'adore", "Dolce Shine Eau de", "Gucci Bloom Eau de", "Annibale Colombo Bed", "Bedside Table African Cherry") "Quick View" feature test (as registered user)

//set category product(s) addition to cart tests

1.	// Test 011 -> set category ("Groceries") single product ("Cat Food") addition to cart test (as a registered user)
2.	// Test 011a -> set category ("Furniture") multiple products ("Annibale Colombo Bed") addition to cart test (as a registered user)

//set category product addition to wishlist test

1.	// Test 012 -> set category ("Groceries") single product ("Cat Food") addition to wishlist test (as a registered user) (the product fails to be added to wishlist, test has failed)

//set category product(s) addition to compare list test

1.	// Test 013 -> set category ("Groceries") single product ("Beef Steak") addition to compare list test (as a registered user) (the product fails to be added to compare list, test has failed)

//add set home page product(s) to checkout tests (only registered users have this feature)

1.	// Test 014 -> add single set home page product ("Chanel Coco Noir Eau De") to check out test (as registered user)
2.	// Test 014a -> add multiple set home page products ("Powder Canister", "Calvin Klein CK One") to check out test (as registered user)

//set category product(s) addition to checkout tests

1.	// Test 015 -> set category ("Groceries") single product ("Cat Food") addition to check out test (as a registered user)
2.	// Test 015a -> set category ("Furniture") multiple products ("Annibale Colombo Bed") addition to check out test (as a registered user)

//update product quantity in shopping cart page test (only registered users have this feature)

1.	// Test 016 -> update product quantity in shopping cart test (as registered user)

//remove product from shopping cart page tests (only registered users have this feature)

1.	// Test 017 -> remove single product from shopping cart test (as registered user) (the button fails to be clicked during automation run, test has failed)
2.	// Test 017a -> remove single product (Clear Cart Button) from shopping cart test (as registered user) (the button fails to be clicked during automation run, test has failed)

//product(s) checkout verification tests (only registered users have this feature)


//credit card payment method

1.	// Test 018 -> valid single home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test (as registered user)
2.	// Test 018a -> valid multiple home page products ("Powder Canister", "Calvin Klein CK One") (credit card) check out confirmation test (as registered user)
3.	// Test 019 -> valid set category ("Groceries") single product ("Cat Food") (credit card) check out confirmation test (as a registered user)
4.	// Test 019a -> valid set category ("Furniture") multiple products ("Annibale Colombo Bed") (credit card) check out confirmation test (as a registered user)

//debit card payment method tests

1.	// Test 020 -> valid single set home page product ("Chanel Coco Noir Eau De") (debit card) check out verification test (as registered user)
2.	// Test 020a -> valid multiple set home page products ("Powder Canister", "Calvin Klein CK One") (debit card) check out confirmation test (as registered user)
3.	// Test 021 -> valid set category ("Groceries") single product ("Cat Food") (debit card) check out confirmation test (as a registered user)
4.	// Test 021a -> valid set category ("Furniture") multiple products ("Annibale Colombo Bed") check out confirmation test (as a registered user)

//paypal payment method tests

1.	// Test 022 -> valid single set home page product ("Chanel Coco Noir Eau De") (PayPal) check out verification test (as registered user)
2.	// Test 022a -> valid multiple set home page products ("Powder Canister", "Calvin Klein CK One") (PayPal) check out confirmation test (as registered user)
3.	// Test 023 -> valid set category ("Groceries") single product ("Cat Food") (PayPal) check out confirmation test (as a registered user)
4.	// Test 023a -> valid set category ("Furniture") multiple products ("Annibale Colombo Bed") (PayPal) check out confirmation test (as a registered user)

//invalid product(s) checkout verification tests

//no singular input

1.	// Test 024 -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping first name (as registered user) (the error wasn't triggered, test has failed)
2.	// Test 024a -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping last name (as registered user) (the error wasn't triggered, test has failed)
3.	// Test 024b -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping email (as registered user) (the error wasn't triggered, test has failed)
4.	// Test 024c -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping phone (as registered user) (the error wasn't triggered, test has failed)
5.	// Test 024d -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping address (as registered user) (the error wasn't triggered, test has failed)
6.	// Test 024e -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping address city (as registered user) (the error wasn't triggered, test has failed)
7.	// Test 024f -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping address state (as registered user) (the error wasn't triggered, test has failed)
8.	// Test 024g -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping address post code (as registered user) (the error wasn't triggered, test has failed)
9.	// Test 024h -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no shipping address country (as registered user) (the error wasn't triggered, test has failed)
10.	// Test 024i -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no credit cardholder name (as registered user) (the error wasn't triggered, test has failed)
11.	// Test 024j -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no credit card number (as registered user) (the error wasn't triggered, test has failed)
12.	// Test 024k -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no credit card expiration date (as registered user) (the error wasn't triggered, test has failed)
13.	// Test 024l -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - no credit card CVV number (as registered user) (the error wasn't triggered, test has failed)

//invalid product(s) checkout verification tests

//too short singular input

1.	// Test 024m -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping first name (1 char) (as registered user) (the error wasn't triggered, test has failed)
2.	// Test 024n -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping last name (1 char) (as registered user) (the error wasn't triggered, test has failed)
3.	// Test 024o -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping email (1 char -> name, domain) (as registered user) (the error wasn't triggered, test has failed)
4.	// Test 024p -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping phone (2 digits) (as registered user) (the error wasn't triggered, test has failed)
5.	// Test 024q -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping address (3 chars) (as registered user) (the error wasn't triggered, test has failed)
6.	// Test 024r -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping city (1 char) (as registered user) (the error wasn't triggered, test has failed)
7.	// Test 024s -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping state (1 char) (as registered user) (the error wasn't triggered, test has failed)
8.	// Test 024t -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping post code (4 digits) (as registered user) (the error wasn't triggered, test has failed)
9.	// Test 024u -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short shipping country (2 chars) (as registered user) (the error wasn't triggered, test has failed)
10.	// Test 024v -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short credit cardholder name (3 chars) (as registered user) (the error wasn't triggered, test has failed)
11.	// Test 024w -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short credit card number (15 digits) (as registered user) (the error wasn't triggered, test has failed)
12.	// Test 024x -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short credit card expiration date (4 chars) (as registered user) (the error wasn't triggered, test has failed)
13.	// Test 024y -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too short credit card CVV number (2 digits) (as registered user) (the error wasn't triggered, test has failed)

//invalid product(s) checkout verification tests

//too long singular input

1.	// Test 024z -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping first name (100 chars) (as registered user) (the error wasn't triggered, test has failed)
2.	// Test 024aa -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping last name (100 chars) (as registered user) (the error wasn't triggered, test has failed)
3.	// Test 024ab -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping email (100 chars -> name, domain) (as registered user) (the error wasn't triggered, test has failed)
4.	// Test 024ac -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping phone (16 digits) (as registered user) (the error wasn't triggered, test has failed)
5.	// Test 024ad -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping address (100 chars) (as registered user) (the error wasn't triggered, test has failed)
6.	// Test 024ae -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping city (100 chars) (as registered user) (the error wasn't triggered, test has failed)
7.	// Test 024af -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping state (100 chars) (as registered user) (the error wasn't triggered, test has failed)
8.	// Test 024ag -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping post code (6 digits) (as registered user) (the error wasn't triggered, test has failed)
9.	// Test 024ah -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long shipping country (100 chars) (as registered user) (the error wasn't triggered, test has failed)
10.	// Test 024ai -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long credit cardholder name (201 chars) (as registered user) (the error wasn't triggered, test has failed)
11.	// Test 024aj -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long credit card number (17 digits) (as registered user) (the error wasn't triggered, test has failed)
12.	// Test 024ak -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long credit card expiration date (6 chars) (as registered user) (the error wasn't triggered, test has failed)
13.	// Test 024al -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - too long credit card CVV number (4 digits) (as registered user) (the error wasn't triggered, test has failed)

//invalid product(s) checkout verification tests

//invalid singular input format

1.	// Test 024am -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping first name format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
2.	// Test 024an -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping last name format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
3.	// Test 024ao -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping email format (missing '@') (as registered user) (the error wasn't triggered, test has failed)
4.	// Test 024ap -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping phone format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
5.	// Test 024aq -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping address format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
6.	// Test 024ar -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping city format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
7.	// Test 024as -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping state format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
8.	// Test 024at -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping post code format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
9.	// Test 024au -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid shipping country format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
10.	// Test 024av -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid credit cardholder name format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
11.	// Test 024aw -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid credit card number format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
12.	// Test 024ax -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid credit card expiration date format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
13.	// Test 024ay -> invalid single set home page product ("Chanel Coco Noir Eau De") (credit card) check out verification test - invalid credit card CVV number format (special symbols only) (as registered user) (the error wasn't triggered, test has failed)
