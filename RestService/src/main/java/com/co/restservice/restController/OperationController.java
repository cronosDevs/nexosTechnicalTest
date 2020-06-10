package com.co.restservice.restController;

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
    @PostMapping("")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseEntity<?> operation(@RequestBody OperationRequestDTO operationRequestDTO) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(iOperationService.operation(operationRequestDTO));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex);
        }
    }

}
