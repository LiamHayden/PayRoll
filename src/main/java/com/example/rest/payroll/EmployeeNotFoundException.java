package com.example.rest.payroll;

class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException(Long id) {
        super("Employee not found " + id);
    }
}
