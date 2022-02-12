package Controller;

import java.util.*;

public interface AccountInterface {
    boolean criarUsuario(String nome, String documento);
    Map<Integer, ArrayList<String>> listarUsuario();
    boolean alterarUsuario(Map<Integer, ArrayList<String>> lista);
}
