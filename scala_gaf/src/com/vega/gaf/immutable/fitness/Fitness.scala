package com.vega.gaf.immutable.fitness
import com.vega.gaf.immutable.chromosome.Chromosome

trait Fitness[T, M] {
//TODO M will need to be something that is comparable with >, < and == are there already traits for this?
/**
 * Returns the fitness of type M of a chromosome of type T
 */
  protected def fitness(chrom: Chromosome[T]) : M

}