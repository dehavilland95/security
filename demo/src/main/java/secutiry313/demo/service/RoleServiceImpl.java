package secutiry313.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import secutiry313.demo.models.Role;
import secutiry313.demo.repository.RoleRepository;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }
}
