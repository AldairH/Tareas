package org.example;

import java.util.Arrays;

public class CasaSinGenericos {
    Object[] content;

    @Override
    public String toString() {
        return "CasaSinGenericos{" +
                "content=" + Arrays.toString(content) +
                '}';
    }

    public CasaSinGenericos() {
    }

    public CasaSinGenericos(Object[] content) {
        this.content = content;
    }
    public void add(int pos, Object objeto){
        content[pos] = objeto;
    }
    public Object get(int pos){
        return content[pos];
    }
}
