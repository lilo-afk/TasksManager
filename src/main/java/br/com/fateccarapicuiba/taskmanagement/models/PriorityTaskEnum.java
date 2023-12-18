package br.com.fateccarapicuiba.taskmanagement.models;

public enum PriorityTaskEnum {
    BAIXA(2, "Baixa"),
    MEDIA(3, "Média"),
    ALTA(4, "Alta");

    private final int value;
    private final String displayName;

    PriorityTaskEnum(int value, String displayName) {
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
