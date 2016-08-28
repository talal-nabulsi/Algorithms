void permuatation(char[] chars) {

    permutation(chars, 0)

}

void permutation(char[] chars, int level) {

    if (level == chars.length -1) {
        System.out.print(chars);
        return;
    }


    for (int i = level; i < chars.length; i++) {

        swap(level, i);
        permutation(chars, level + 1)
        swap(level, i);

    }


}

[C,A,T]