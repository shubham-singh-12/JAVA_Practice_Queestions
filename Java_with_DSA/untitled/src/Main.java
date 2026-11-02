// =========================== PRINTING IN JAVA ===========================
// ================================ Syntax ================================
// System.out.println("text");

// =============================== Example ================================
//void main() {
//    System.out.println("Hello World");      // Prints the text on the console
//}

// ========================================================================
// ========================= STRING CONCATENATION =========================
// =============================== Example ================================
//void main() {
//    System.out.println("Hello World" + "Hello Dunia");
//}

// ========================================================================
// =========================== PRINT vs PRINTLN ===========================
// =============================== Example ================================
//void main() {
//    System.out.print("Hello World");
//    System.out.print("Hell Dunia");
//    System.out.print(3);
//}

// =============================== Example ================================
//void main() {
//    System.out.println("Hello World" + "Hello Dunia");
//    System.out.println(3);
//}

// ========================================================================
// ========================= STRING vs EXPRESSION =========================
// =========================== Example (String) ===========================
//void main() {
//    System.out.println("4 + 3");                // 4 + 3
//}

// ========================= Example (Expression) =========================
//void main() {
//    System.out.println(4 + 3);                  // 7
//}

// ========================================================================
// =========================== COMBINED EXAMPLE ===========================
// ================================= Code =================================
//void main() {
//    System.out.println("Hello World" + "Hello Dunia");          // Hello WorldHello Dunia
//    System.out.println(3);                                      // 3
//    System.out.println("4 + 3");                                // 4 + 3
//    System.out.println(4 + 3);                                  // 7
//}

// ========================================================================
// =============================== COMMENTS ===============================
// =============================== Example ================================
//void main() {
//    My name is Shubham Singh;           // ERROR: Compiler does not understand this
//}

// =============================== Example ================================
//void main() {
/// /    My name is Shubham Singh
//    System.out.println(4 + 3);                  // 7
//}

// ========================================================================
// ========================= SINGLE-LINE COMMENT ==========================
// ================================ Syntax ================================

// this line is ignored by the compiler

// ========================== MULTI-LINE COMMENT ==========================
// ================================ Syntax ================================
/*
any number of lines
        of comment text or code
*/

void main() {
    /*
    System.out.println("Hello World");
    System.out.println("Hello Dunia");
    My name is Shubham Singh
     */

    System.out.println(4 + 3);      // this line is not commented, so it runs
}
