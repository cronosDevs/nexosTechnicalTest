package com.co.restservice.restController;

import com.co.restservice.commons.constant.AppConstant;
import com.co.restservice.domain.FormulaDTO;
import com.co.restservice.domain.OperationErrorDTO;
import com.co.restservice.domain.OperationRequestDTO;
import com.co.restservice.domain.OperationResponseDTO;
import com.co.restservice.service.IOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.ValidationException;

@RestController
@RequestMapping(value = "/operations")
@CrossOrigin(origins = "*", methods = {RequestMethod.DELETE, RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class OperationController implements IOperationController {

    IOperationService iOperationService;

    @Autowired
    public OperationController(IOperationService iOperationService) {
        this.iOperationService = iOperationService;
    }

    @Override
    @PostMapping("/add")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseEntity<?> add(@RequestBody OperationRequestDTO operationRequestDTO) {
        try {
            operationRequestDTO.setOperator(AppConstant.ADD);
            return ResponseEntity.status(HttpStatus.OK).body(iOperationService.operation(operationRequestDTO));
        } catch (ValidationException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(OperationErrorDTO.builder()
                            .errorMessage(ex.getMessage()).build());
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(OperationErrorDTO.builder()
                            .errorMessage(ex.getMessage()).build());
        }
    }

    @Override
    @PostMapping("/subtract")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseEntity<?> subtract(@RequestBody OperationRequestDTO operationRequestDTO) {
        try {
            operationRequestDTO.setOperator(AppConstant.SUBTRACTION);
            return ResponseEntity.status(HttpStatus.OK).body(iOperationService.operation(operationRequestDTO));
        } catch (ValidationException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(OperationErrorDTO.builder()
                            .errorMessage(ex.getMessage()).build());
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(OperationErrorDTO.builder()
                            .errorMessage(ex.getMessage()).build());
        }
    }

    @Override
    @PostMapping("/multiply")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseEntity<?> multiply(@RequestBody OperationRequestDTO operationRequestDTO) {
        try {
            operationRequestDTO.setOperator(AppConstant.MULTIPLY);
            return ResponseEntity.status(HttpStatus.OK).body(iOperationService.operation(operationRequestDTO));
        } catch (ValidationException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(OperationErrorDTO.builder()
                            .errorMessage(ex.getMessage()).build());
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(OperationErrorDTO.builder()
                            .errorMessage(ex.getMessage()).build());
        }
    }

    @Override
    @PostMapping("/divide")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseEntity<?> divide(@RequestBody OperationRequestDTO operationRequestDTO) {
        try {
            operationRequestDTO.setOperator(AppConstant.DIVIDE);
            return ResponseEntity.status(HttpStatus.OK).body(iOperationService.operation(operationRequestDTO));
        } catch (ValidationException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(OperationErrorDTO.builder()
                            .errorMessage(ex.getMessage()).build());
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(OperationErrorDTO.builder()
                            .errorMessage(ex.getMessage()).build());
        }
    }

    @Override
    @PostMapping("/formulas/{formulaName}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseEntity<?> formula(@RequestBody FormulaDTO formulaDTO, @PathVariable String formulaName) {
        OperationResponseDTO operationResponseDTO;
        try {
            switch (formulaName) {
                case AppConstant.FORMULA_PENDIENTE:
                    operationResponseDTO = iOperationService.formulaPendiente(formulaDTO);
                    break;
                case AppConstant.FORMULA_PROMEDIO:
                    operationResponseDTO = iOperationService.formulaPromedio(formulaDTO);
                    break;
                case AppConstant.AREA_TRIANGULO:
                    operationResponseDTO = iOperationService.formulaAreaTriangulo(formulaDTO);
                    break;
                case AppConstant.AREA_CIRCULO:
                    operationResponseDTO = iOperationService.formulaAreaCirculo(formulaDTO);
                    break;
                default:
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                            .body(OperationErrorDTO.builder()
                                    .errorMessage("the formula doesn't exist").build());
            }
            return ResponseEntity.status(HttpStatus.OK).body(operationResponseDTO);
        } catch (ValidationException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(OperationErrorDTO.builder()
                            .errorMessage(ex.getMessage()).build());
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(OperationErrorDTO.builder()
                            .errorMessage(ex.getMessage()).build());
        }
    }

}
