package enumerate;

public enum EnumDemo implements Show{
    Spring("春"){
        @Override
        public void show() {
            System.out.println("春天来了");
        }
    },
    Summer("夏"){
        @Override
        public void show() {
            System.out.println("夏天来了");
        }
    },Fall("秋"){
        @Override
        public void show() {
            System.out.println("秋天来了");
        }
    },Winter("冬"){
        @Override
        public void show() {
            System.out.println("冬天来了");
        }
    };
    private String name;

    EnumDemo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
