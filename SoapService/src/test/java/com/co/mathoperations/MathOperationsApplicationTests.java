package com.co.mathoperations;

import com.co.mathoperations.domain.GetOperationRequest;
import com.co.mathoperations.service.MathOperationService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class MathOperationsApplicationTests {

    MathOperationService mathOperationService = new MathOperationService();

    @Test
    public void add() {
        GetOperationRequest getOperationRequest = new GetOperationRequest();
        getOperationRequest.setNumOne(5.0);
        getOperationRequest.setNumTwo(5.0);
        getOperationRequest.setOperator("add");

        double result = mathOperationService.operation(getOperationRequest).getResult();
        assertEquals(10.0, result, 0.0002);
    }

    @Test
    public void subtract() {
        GetOperationRequest getOperationRequest = new GetOperationRequest();
        getOperationRequest.setNumOne(5.0);
        getOperationRequest.setNumTwo(5.0);
        getOperationRequest.setOperator("subtraction");

        double result = mathOperationService.operation(getOperationRequest).getResult();
        assertEquals(0.0, result, 0.0002);
    }

    @Test
    public void multiply() {
        GetOperationRequest getOperationRequest = new GetOperationRequest();
        getOperationRequest.setNumOne(5.0);
        getOperationRequest.setNumTwo(5.0);
        getOperationRequest.setOperator("multiply");

        double result = mathOperationService.operation(getOperationRequest).getResult();
        assertEquals(25.0, result, 0.0002);
    }

    @Test
    public void divide() {
        GetOperationRequest getOperationRequest = new GetOperationRequest();
        getOperationRequest.setNumOne(5.0);
        getOperationRequest.setNumTwo(5.0);
        getOperationRequest.setOperator("divide");

        double result = mathOperationService.operation(getOperationRequest).getResult();
        assertEquals(1.0, result, 0.0002);
    }
}
