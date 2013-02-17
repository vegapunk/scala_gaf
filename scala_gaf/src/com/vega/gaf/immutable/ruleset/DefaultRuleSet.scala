package com.vega.gaf.immutable.environment.impl
import com.vega.gaf.immutable.environment.RuleSet
import com.vega.gaf.immutable.environment.Population
import com.vega.gaf.immutable.ruleset.mutation.Mutation
import com.vega.gaf.immutable.ruleset.crossover.Crossover
import com.vega.gaf.immutable.chromosome.Chromosome
import com.vega.gaf.immutable.gene.Gene
import scala.util.Random

trait DefaultRuleSet[T] extends RuleSet[T]{
	def iterate(env: Population[T]) : Population[T] = {
		def mut(chrom:Chromosome[T]):Chromosome[T] = {
			val mutPoint = new Random().nextInt(chrom.genes.size)
			val seq = for(i <- 0 to chrom.genes.size-1) yield {
				if (i == mutPoint) mutate(chrom.genes(i)) else chrom.genes(i)
			}
			Chromosome(seq.toList)
		}
		
		val toCross = selectForCrossover(env)
		val chroms = for(chromPair <- toCross) yield crossover(chromPair._1, chromPair._2)
		val mutatedChroms = for(chrom <- chroms) yield mut(chrom)
		Population(mutatedChroms)		
	}
	
}