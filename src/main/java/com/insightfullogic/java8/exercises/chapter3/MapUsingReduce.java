package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.exercises.Exercises;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Advanced Exercises Question 2
 */
public class MapUsingReduce {

    public static <I, O> List<O> map(Stream<I> stream, Function<I, O> mapper) {
//        return stream.reduce(new ArrayList<O>(), (List<O> lista, I elemento) -> {
//            lista.add(mapper.apply(elemento));
//            return lista;
//        });
        return Exercises.replaceThisWithSolution();
    }

}
