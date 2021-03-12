package com.ss.mailsender.controllers;

import com.ss.mailsender.services.FileProcessor;
import com.ss.mailsender.services.ThreadSender;
import com.ss.mailsender.services.ThreadsList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FileUploadController {

    private static final Logger logger = LoggerFactory.getLogger(FileUploadController.class);
    private final FileProcessor fileProcessor;

    @Autowired
    public FileUploadController(FileProcessor fileProcessor) {
        this.fileProcessor = fileProcessor;
    }

    @GetMapping("/")
    public String uploadFormView() {
        return "uploadForm";
    }

//    @PostMapping("/")
//    public String handleFileUpload(@RequestParam("file") MultipartFile file,
//                                   RedirectAttributes redirectAttributes) {
//        ThreadSender thread = new ThreadSender(file);
//        thread.start();
//        ThreadsList.addThread(thread);
//
//        redirectAttributes.addFlashAttribute("message", thread.toString());
//
//        return "redirect:/";
//    }
}
