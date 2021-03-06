package model.stockfish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Stockfish {
    private final String path = System.getProperty("user.dir") + "\\stockfish\\Windows\\stockfish_9_x32.exe";
    private OutputStreamWriter writer;
    private BufferedReader reader;
    private OutputStreamWriter processWriter;
    private BufferedReader processReader;
    
	public void connect()
    {
        Runtime rt = Runtime.getRuntime();
        Process process = null;

        try {
            process = rt.exec(this.path);
            this.writer = new OutputStreamWriter(process.getOutputStream());
            this.reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            // TODO: Add UCI protocol commands
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    public void sendCommand(String command) {
		try {
			processWriter.write(command + "\n");
			processWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    public void stopEngine() {
		
		try {
			sendCommand("quit");
			processReader.close();
			processWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
