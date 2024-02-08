package dev.victorvilela.labseq.controllers;

import java.math.BigInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.victorvilela.labseq.services.LabseqService;

@RestController
@RequestMapping("/labseq")
public class LabseqController {
    private final LabseqService labseqService;

    public LabseqController(LabseqService labseqService) {
        this.labseqService = labseqService;
    }

    @GetMapping("/{n}")
    public Long getLabseqValue(@PathVariable long n) {
        return labseqService.getLabSeqValue(n);
    }
}
