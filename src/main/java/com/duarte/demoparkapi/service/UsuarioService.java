package com.duarte.demoparkapi.service;

import com.duarte.demoparkapi.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UsuarioService {


    private final UsuarioRepository usuarioRepository;
}
