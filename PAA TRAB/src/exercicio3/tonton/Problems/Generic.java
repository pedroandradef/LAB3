package exercicio3.tonton.Problems;

import exercicio3.tonton.Genetics.Gene;
import exercicio3.tonton.Genetics.Individual;
import exercicio3.tonton.Genetics.Population;

/*
    Generic algorithm in which individual has its fitness based
    on how many active genes it has
*/
public class Generic extends Population {

    @Override
    protected void computeFitnessScore() {
        for (Individual i : population) {
            Gene[] genes = i.getChromosome();
            int activeGenes = 0;
            for (Gene gene : genes) {
                if (gene.isActive())
                    activeGenes++;
            }
            i.setFitnessScore(activeGenes);
        }
    }

    //generate chromosomes for a new individual
    @Override
    public Individual generateIndividual(int chromosomeSize) {
        Gene[] genes = new Gene[chromosomeSize];
        for (int i = 0; i < chromosomeSize; i++)
            genes[i] = new Gene("Gene " + i, Math.random() < 0.5);
        return new Individual(genes);
    }
}
