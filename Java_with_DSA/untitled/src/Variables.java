// ======================== CREATING A VARIABLE =========================
// =============================== Syntax ===============================
// dataType variableName = value;

// ============================== Example ===============================
// int userAge = 5;

// ======================================================================
// ======================== CREATING A VARIABLE =========================
// ============================== Example ===============================
//public class Variables {
//    public static void main(String[] args) {
//        int userAge = 5;
//        System.out.println(userAge);                    // 5
//    }
//}

// ============================ More Examples =============================
//public class Variables {
//    static void main(String[] args) {
//        int problemSolved = 120;
//        double completionRate;              // DECLARATION
//        completionRate = 87.5;              // ASSIGNMENT LATER
//        boolean isPremiumMember = true;     // DECLARATION + ASSIGNMENT TOGETHER
//    }
//}

// ========================================================================
// ===================== DECLARATION & INITIALIZATION =====================
// ============================= DECLARATION ==============================
// ================================ Syntax ================================
//public class Variables {
//    static void main(String[] args) {
//        int age;
//    }
//}

// ========================================================================
// =================== USING A VARIABLE WITHOUT A VALUE ===================
// ================================= Code =================================
//public class Variables {
//    static void main(String[] args) {
//        int age;                        // DECLARED, but no value assigned
//        System.out.println(age);        // ERROR: variable age might not have been initialized
//    }
//}

// ========================================================================
// ======================= DECLARATION + ASSIGNMENT =======================
// ================================= Code =================================
//public class Variables {
//    static void main(String[] args) {
//        int userAge;                        // Declaration
//        userAge = 10;                       // Assignment
//        System.out.println(userAge);        // 10
//    }
//}

// ========================================================================
// ============================ INITIALIZATION ============================
// ================================= Code =================================
public class Variables {
    static void main(String[] args) {
        int totalMarks = 20;                // Declaration + Initialization
        System.out.println(totalMarks);     // 20
    }
}