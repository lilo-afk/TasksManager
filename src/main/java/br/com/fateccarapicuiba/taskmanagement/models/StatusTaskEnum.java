package br.com.fateccarapicuiba.taskmanagement.models;

public enum StatusTaskEnum {
    A_FAZER(2, "A fazer"),
    FAZENDO(3, "Fazendo"),
    CONCLUIDA(4, "Concluída");

    private final int value;
    private final String displayName;

    StatusTaskEnum(int value, String displayName) {
        this.value = value;
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getValue() {
        return value;
    }
}
