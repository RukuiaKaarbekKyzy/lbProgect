package library.controller;

import library.models.Role;
import library.repository.RoleRepository;
import library.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @PostMapping
    public Role addRole(@RequestBody Role role) {
        return roleService.addRole(role);
    }
}

