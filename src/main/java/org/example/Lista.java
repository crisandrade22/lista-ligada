package org.example;

public class Lista {
    private No primeiro;

//    por clareza
    public Lista() {
        setPrimeiro(null);
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public void insereInicio(int i) {
        No novo = new No(i);
        if(estaVazia()) {
            setPrimeiro(novo);
        } else {
            novo.setProximo(primeiro);
            setPrimeiro(novo);
        }
    }

    public int removeInicio() {
        int aux = getPrimeiro().getInfo();;
        setPrimeiro(primeiro.getProximo());
        return aux;
    }
    public void insereFim(int i) {
        No novo = new No(i);
        if(estaVazia()) {
            setPrimeiro(novo);
        } else {
            No auxNo = primeiro;
            while(auxNo.getProximo() != null) {
                auxNo = auxNo.getProximo();
            }
            auxNo.setProximo(novo);
        }
    }
    public int removeFim() {
        int auxInt;
//        se isso for verdade a lista tem somente um elemento.
        if(primeiro.getProximo() == null) {
            auxInt = primeiro.getInfo();
            setPrimeiro(null);
        } else {
            No auxNo = primeiro;
            while(auxNo.getProximo().getProximo() != null) {
                auxNo = auxNo.getProximo();
            }
            auxInt = auxNo.getProximo().getInfo();
            auxNo.setProximo(null);
        }
        return auxInt;
    }

    @Override
    public String toString() {
        String s = "lista: ";
        if(estaVazia()) {
            s = s + "esta vazia.";
        } else {
            No auxNo = primeiro;
            while(auxNo != null) {
                s = s + " " + auxNo;
                auxNo = auxNo.getProximo();
            }
            s = s + "null";
        }
        return s;
    }
}
