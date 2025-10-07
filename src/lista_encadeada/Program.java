import entities.Order;

class No {
    int valor;
    No proximo;

    No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class ListaEncadeada {
    No cabeca;

    void adicionar(int valor) {
        No novo = new No(valor);
        if (cabeca == null) {
            cabeca = novo;
        } else {
            No temp = cabeca;
            while (temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = novo;
        }
    }

    void imprimir() {
        No temp = cabeca;
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.proximo;
        }
    }
}

enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPEND(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {
            System.out.println(" ");
            System.out.println("CODE " + code);
            System.out.println(value.getCode());
            if (value.getCode() == code) {
                System.out.println("VALOR: " + value);
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code.");
    }
}

public class Program {
    public static void main(String[] args) {
        OrderStatus order = OrderStatus.PAID;
        order.valueOf(5);
    }   
}