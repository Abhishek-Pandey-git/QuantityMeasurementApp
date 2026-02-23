package com.app.quantitymeasurementapp.QuantityMeasurementApp;

//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class UC7TestCases {
	
	// ==========================================
    // --- UC7: DYNAMIC TARGET UNIT ADDITION MATRIX ---
    // ==========================================

    @ParameterizedTest(name = "UC7 {index}: {0} {1} + {2} {3} to {5} = {4} {5}")
    @MethodSource("provideDataForUC7AdditionMatrix")
    public void testAdditionWithTargetUnitMatrix(double val1, Length.LengthUnit unit1, double val2, Length.LengthUnit unit2, double expectedSum, Length.LengthUnit targetUnit) {
        
        // 1. Arrange
        Length length1 = new Length(val1, unit1);
        Length length2 = new Length(val2, unit2);
        Length expectedLength = new Length(expectedSum, targetUnit);
        
        // 2. Act: Call your new UC7 demonstration method
        Length actualSumLength = QuantityMeasurementApp.demonstrateLengthAddition(length1, length2, targetUnit);
        
        // 3. Assert: Verify the app's math matches the test's math
        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(actualSumLength, expectedLength),
            "Failed UC7 addition: " + val1 + " " + unit1 + " + " + val2 + " " + unit2 + " targeting " + targetUnit);
    }

    // The Data Factory generating 64 combinations
    private static Stream<Arguments> provideDataForUC7AdditionMatrix() {
       List<Arguments> arguments = new ArrayList<>();

        // Using 2.0 and 3.0 to ensure the math is thoroughly tested
        double val1 = 2.0; 
        double val2 = 3.0;

        // Loop 1: First operand's unit
        for (Length.LengthUnit unit1 : Length.LengthUnit.values()) {
            // Loop 2: Second operand's unit
            for (Length.LengthUnit unit2 : Length.LengthUnit.values()) {
                // Loop 3: The requested TARGET unit
                for (Length.LengthUnit targetUnit : Length.LengthUnit.values()) {
                    
                    // Step A: Calculate total inches mathematically
                    double totalBaseUnits = (val1 * unit1.getConversionFactor()) + (val2 * unit2.getConversionFactor());
                    
                    // Step B: Convert to the explicit target unit
                    double rawExpected = totalBaseUnits / targetUnit.getConversionFactor();
                    
                    // Step C: Round to 2 decimals to match the core Length.java logic
                    double expectedSumValue = Math.round(rawExpected * 100.0) / 100.0;
                    
                    // Add it to the test queue
                    arguments.add(org.junit.jupiter.params.provider.Arguments.of(val1, unit1, val2, unit2, expectedSumValue, targetUnit));
                }
            }
        }
        
        return arguments.stream();
    }
	
}
