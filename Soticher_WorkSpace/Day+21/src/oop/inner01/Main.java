package oop.inner01;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class Main {

	public static void main(String[] args) {
		
		//익명 중첩 클래스
		// - 클래스의 범용성을 넓히기 위한 재정의 구문
		// - 내가 만들어 놓은 클래스의 내용을 추가 + 수정할 수 있다(1회용)
		// - 여러개 중에서 1~2개가 맘에 안들때 사용
		// - 객체 하나에만 영향을 줌 : 1회용
		
//		public final void push() {코드} 재정 블가 메소드
//		public void push() {코드} 재정 가능 메소드(선택 가능)
//		public abstract void push() ; 재정 강제 메소드(추상메소드)

		Key enter = new Key() {
			//메소드의 오버라이드
			// - 메소드의 재정의
			// - 메소드의 형태는 반드시 일치되어야함
			
			public void push() {
				System.out.println("실행");
			}
			
		};
		enter.push();
			
		Key esc = new Key() {
			public void push() {
				exit();
				System.out.println("종료!");
			}
			
			public void exit() {
				System.out.println("프로그램이 종료됩니다");
				System.exit(0);
			}
		};
		esc.push();
		
		Key Key = new Key() {
			public void push() {
				System.out.println("뭐라는지 모르겠어요");
			}
		};
		Key.push();
		
		Connection con = new Connection() {

			@Override
			public boolean isWrapperFor(Class<?> arg0) throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public <T> T unwrap(Class<T> arg0) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void abort(Executor arg0) throws SQLException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void clearWarnings() throws SQLException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void close() throws SQLException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void commit() throws SQLException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Array createArrayOf(String arg0, Object[] arg1) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Blob createBlob() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Clob createClob() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public NClob createNClob() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public SQLXML createSQLXML() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Statement createStatement() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Statement createStatement(int arg0, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Statement createStatement(int arg0, int arg1, int arg2) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Struct createStruct(String arg0, Object[] arg1) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean getAutoCommit() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String getCatalog() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Properties getClientInfo() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getClientInfo(String arg0) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int getHoldability() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public DatabaseMetaData getMetaData() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int getNetworkTimeout() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public String getSchema() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int getTransactionIsolation() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public Map<String, Class<?>> getTypeMap() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public SQLWarning getWarnings() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean isClosed() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isReadOnly() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isValid(int arg0) throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String nativeSQL(String arg0) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public CallableStatement prepareCall(String arg0) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public CallableStatement prepareCall(String arg0, int arg1, int arg2) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public CallableStatement prepareCall(String arg0, int arg1, int arg2, int arg3) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public PreparedStatement prepareStatement(String arg0) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public PreparedStatement prepareStatement(String arg0, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public PreparedStatement prepareStatement(String arg0, int[] arg1) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public PreparedStatement prepareStatement(String arg0, String[] arg1) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public PreparedStatement prepareStatement(String arg0, int arg1, int arg2) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public PreparedStatement prepareStatement(String arg0, int arg1, int arg2, int arg3)
					throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void releaseSavepoint(Savepoint arg0) throws SQLException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void rollback() throws SQLException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void rollback(Savepoint arg0) throws SQLException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setAutoCommit(boolean arg0) throws SQLException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setCatalog(String arg0) throws SQLException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setClientInfo(Properties arg0) throws SQLClientInfoException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setClientInfo(String arg0, String arg1) throws SQLClientInfoException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setHoldability(int arg0) throws SQLException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setNetworkTimeout(Executor arg0, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setReadOnly(boolean arg0) throws SQLException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Savepoint setSavepoint() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Savepoint setSavepoint(String arg0) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setSchema(String arg0) throws SQLException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setTransactionIsolation(int arg0) throws SQLException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setTypeMap(Map<String, Class<?>> arg0) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
		};
		
	}
		
		
}


