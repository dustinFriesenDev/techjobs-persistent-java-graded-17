package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Job;

import java.util.Comparator;

public class JobComparator implements Comparator<Job> {

    @Override
    public int compare(Job a1, Job a2) {
        return a1.getName().compareTo(a2.getName());
    }

}
