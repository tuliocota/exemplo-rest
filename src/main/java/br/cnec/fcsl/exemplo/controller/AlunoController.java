/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cnec.fcsl.exemplo.controller;

import br.cnec.fcsl.exemplo.dao.AlunoDao;
import br.cnec.fcsl.exemplo.entidade.Aluno;
import java.util.List;

public class AlunoController {

    private final AlunoDao alunoDao;

    public AlunoController() {
        alunoDao = new AlunoDao();
    }

    public List<Aluno> getAlunos() {
        return alunoDao.listar();
    }
}
