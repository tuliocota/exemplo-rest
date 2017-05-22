/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cnec.fcsl.exemplo.dao;

import br.cnec.fcsl.exemplo.entidade.Aluno;

public class AlunoDao extends GenericDao<Aluno> {

    public AlunoDao() {
        super(Aluno.class);
    }

}
