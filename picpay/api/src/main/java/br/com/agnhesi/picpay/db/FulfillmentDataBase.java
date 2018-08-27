package br.com.agnhesi.picpay.db;

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.zip.GZIPInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agnhesi.picpay.model.User;
import br.com.agnhesi.picpay.model.FirstPriority;
import br.com.agnhesi.picpay.model.SecondPriority;


import br.com.agnhesi.picpay.dao.FirstPriorityDAO;
import br.com.agnhesi.picpay.dao.SecondPriorityDAO;
import br.com.agnhesi.picpay.dao.UserDAO;


@RestController
@RequestMapping("import")
public class FulfillmentDataBase {
    private final UserDAO userDAO;
    private final FirstPriorityDAO firstPriorityDAO;
    private final SecondPriorityDAO secondPriorityRepository;

    private static boolean isImporting;

    @Autowired
    public FulfillmentDataBase(UserDAO userDAO, FirstPriorityDAO firstPriorityDAO, SecondPriorityDAO secondPriorityRepository) {
        this.userDAO = userDAO;
        this.firstPriorityDAO = firstPriorityDAO;
        this.secondPriorityRepository = secondPriorityRepository;
    }

    // TODO: isImporting
    @PostMapping
    public ResponseEntity<?> importFile() {
        String msg = null;

        if (isImporting) {
            msg = "Uma importação já foi iniciada com sucesso. Aguarde um momento para que os dados estejam disponíveis.";
        } else {
            isImporting = true;

            if (userDAO.count() > 0) {
                msg = "O banco precisa estar vazio para a realização da importação.";
            } else {
                this.importFirstPriorityFromFile();
                System.out.println("Done - importFirstPriorityFromFile");
                this.importSecondPriorityFromFile();
                System.out.println("Done - importSecondPriorityFromFile");
                this.importUserFromFile();
                System.out.println("Done - importUserFromFile");
            }

            isImporting = false;
        }

        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    // TODO: isImporting
    private void importUserFromFile() {
        BufferedReader reader = null;
        GZIPInputStream gzip = null;
        String line = null;

        try {
            URL url = new URL("https://s3.amazonaws.com/careers-picpay/users.csv.gz");

            gzip = new GZIPInputStream(url.openStream());
            reader = new BufferedReader(new InputStreamReader(gzip));

            while ((line = reader.readLine()) != null) {
                System.out.println("---->" + line);

                User user = new User();

                String[] vet = line.split(",");
                user.setId(vet[0]);
                if (vet.length > 1) {
                    user.setName(vet[1]);
                }
                if (vet.length > 2) {
                    user.setUsername(vet[2]);
                }

                userDAO.save(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void importFirstPriorityFromFile() {
        BufferedReader reader = null;

        try {
            URL url = new URL("https://raw.githubusercontent.com/PicPay/trabalhe-conosco-backend-dev/master/lista_relevancia_1.txt");

            reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                FirstPriority p1 = new FirstPriority();
                p1.setId(line);

                firstPriorityDAO.save(p1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void importSecondPriorityFromFile() {
        BufferedReader reader = null;

        try {
            URL url = new URL("https://raw.githubusercontent.com/PicPay/trabalhe-conosco-backend-dev/master/lista_relevancia_2.txt");

            reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                SecondPriority p2 = new SecondPriority();
                p2.setId(line);

                secondPriorityRepository.save(p2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}*/
