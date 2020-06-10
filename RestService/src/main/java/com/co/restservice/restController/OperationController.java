package com.co.restservice.restController;

import com.co.restservice.domain.OperationRequestDTO;
import com.co.restservice.domain.OperationResponseDTO;
import com.co.restservice.service.IOperationService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public OperationResponseDTO operation(@RequestBody OperationRequestDTO operationRequestDTO) {
        return iOperationService.operation(operationRequestDTO);
    }

}
