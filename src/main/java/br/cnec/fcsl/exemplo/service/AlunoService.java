/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cnec.fcsl.exemplo.service;

import br.cnec.fcsl.exemplo.controller.AlunoController;
import br.cnec.fcsl.exemplo.entidade.Aluno;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alunos")
public class AlunoService {

    private final AlunoController alunoController;

    public AlunoService() {
        alunoController = new AlunoController();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Aluno> getAlunos() {
        return alunoController.getAlunos();
    }
}
