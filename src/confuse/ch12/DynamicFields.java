package confuse.ch12;

// 定义一个异常
class DynamicFieldsException extends Exception {}

public class DynamicFields {
    // 成对的对象
    private Object[][] fields;
    // 构造方法
    public DynamicFields(int initialSize) {
        fields = new Object[initialSize][2];
        // 元素都设置为null
        for (int i = 0; i < initialSize; ++i) {
            fields[i] = new Object[] {
                    null, null
            };
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object[] obj : fields) {
            result.append(obj[0]);
            result.append(": ");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString();
    }

    // 查询是否存在某id
    private int hasField(String id) {
        for (int i = 0; i < fields.length; ++i) {
            if (id.equals(fields[i][0])) {
                return i;
            }
        }
        return -1;
    }

    // 获取fieldNum，如果有，则返回行数，如果没有，则抛出异常
    private int getFieldNumber(String id) throws NoSuchFieldException {
        int fieldNum = hasField(id);
        if (fieldNum == -1) {
            throw new NoSuchFieldException();
        }
        return fieldNum;
    }

    private int makeField(String id) {
        for (int i = 0; i < fields.length; ++i) {
            if (fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }
        }
        // 如果是满的，则构造一个新的二维数组
        // 然后把老数据全部复制过来
        Object[][] tmp = new Object[fields.length + 1][2];
        for (int i = 0; i < fields.length; ++i) {
            tmp[i] = fields[i];
        }
        // 将新添加的位置置为null
        for (int i = fields.length; i < tmp.length; ++i) {
            tmp[i] = new Object[] {
                    null, null
            };
        }
        fields = tmp;
        // 竟然用到了递归
        return makeField(id);
    }

    // 根据id获得对应的值
    public Object getField(String id) throws NoSuchFieldException {
        return fields[getFieldNumber(id)][1];
    }

    public Object setField(String id, Object value) throws DynamicFieldsException {
        // 如果值为null，则抛出异常
        if (value == null) {
            DynamicFieldsException dfe = new DynamicFieldsException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }
        int fieldNumber = hasField(id);
        if (fieldNumber == -1) {
            fieldNumber = makeField(id);
        }
        Object result = null;
        try {
            result = getField(id);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        fields[fieldNumber][1] = value;
        return result;
    }

    public static void main(String[] args) {
        DynamicFields df = new DynamicFields(3);
        System.out.println(df);
        try {
            df.setField("d", "A value for d");
            df.setField("number", 47);
            df.setField("number2", 48);
            System.out.println(df);
            df.setField("d", "A new vlaue for d");
            df.setField("number3", 11);
            System.out.println("df: " + df);
            System.out.println("df.getField(\"\") : " + df.getFieldNumber("d"));
            Object field = df.setField("d", null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace(System.out);
        } catch (DynamicFieldsException e) {
            e.printStackTrace();
        }
    }
}
