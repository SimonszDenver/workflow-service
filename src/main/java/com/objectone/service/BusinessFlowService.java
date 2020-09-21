package com.objectone.service;

import com.objectone.dto.Seller;
import com.objectone.dto.response.ProcessInstanceResponse;

public interface NcellService {
    ProcessInstanceResponse startProcessInstance(Seller seller);
}
