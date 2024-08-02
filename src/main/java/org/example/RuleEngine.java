package org.example;

import java.util.Map;

public enum RuleEngine {
    RULE_A {
        /**
         * Evaluates the RULE_A rule.
         *
         * @param data the input data map
         * @return the evaluation result as an integer value
         */
        @Override
        public int evaluate(Map<String, Object> data) {
            // Implement the evaluation logic for RULE_A
            return (boolean) data.get("condition_a") ? 1 : 0;
        }

        /**
         * Executes the RULE_A rule.
         *
         * @param data the input data map
         */
        @Override
        public void execute(Map<String, Object> data) {
            // Implement the execution logic for RULE_A
            System.out.println("Executing RULE_A");
        }
    },
    RULE_B {
        /**
         * Evaluates the RULE_B rule.
         *
         * @param data the input data map
         * @return the evaluation result as an integer value
         */
        @Override
        public int evaluate(Map<String, Object> data) {
            // Implement the evaluation logic for RULE_B
            return (boolean) data.get("condition_b") ? 1 : 0;
        }

        /**
         * Executes the RULE_B rule.
         *
         * @param data the input data map
         */
        @Override
        public void execute(Map<String, Object> data) {
            // Implement the execution logic for RULE_B
            System.out.println("Executing RULE_B");
        }
    },
    RULE_C {
        /**
         * Evaluates the RULE_C rule.
         *
         * @param data the input data map
         * @return the evaluation result as an integer value
         */
        @Override
        public int evaluate(Map<String, Object> data) {
            // Implement the evaluation logic for RULE_C
            return (boolean) data.get("condition_c") ? 1 : 0;
        }

        /**
         * Executes the RULE_C rule.
         *
         * @param data the input data map
         */
        @Override
        public void execute(Map<String, Object> data) {
            // Implement the execution logic for RULE_C
            System.out.println("Executing RULE_C");
        }
    },
    RULE_D {
        /**
         * Evaluates the RULE_D rule.
         *
         * @param data the input data map
         * @return the evaluation result as an integer value
         */
        @Override
        public int evaluate(Map<String, Object> data) {
            // Implement the evaluation logic for RULE_D
            return (boolean) data.get("condition_d") ? 1 : 0;
        }

        /**
         * Executes the RULE_D rule.
         *
         * @param data the input data map
         */
        @Override
        public void execute(Map<String, Object> data) {
            // Implement the execution logic for RULE_D
            System.out.println("Executing RULE_D");
        }
    };

    /**
     * Evaluates the rule and returns the result as an integer value.
     *
     * @param data the input data map
     * @return the evaluation result as an integer value
     */
    public abstract int evaluate(Map<String, Object> data);

    /**
     * Executes the rule.
     *
     * @param data the input data map
     */
    public abstract void execute(Map<String, Object> data);

    /**
     * Runs the rule engine with the provided input data.
     *
     * @param data the input data map
     */
    public static void run(Map<String, Object> data) {
        StringBuilder ruleString = new StringBuilder();
        boolean ruleTriggered = false;

        if (RuleEngine.RULE_A.evaluate(data) == 1) {
            ruleString.append("1");
            RuleEngine.RULE_A.execute(data);
        }else{
            ruleString.append("0");
        }
        if (RuleEngine.RULE_B.evaluate(data) == 1) {
            ruleString.append("1");
            RuleEngine.RULE_B.execute(data);
        }else{
            ruleString.append("0");
        }

        if (RuleEngine.RULE_C.evaluate(data) == 1) {
            ruleString.append("1");
            RuleEngine.RULE_C.execute(data);
        }else{
            ruleString.append("0");
        }

        if (RuleEngine.RULE_D.evaluate(data) == 1) {
            ruleString.append("1");
            RuleEngine.RULE_D.execute(data);
        }else{
            ruleString.append("0");
        }

        System.out.println("Executed rules: " + ruleString.toString());
    }
}

